package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateTestDataExcel {
	public static void main(String[] args) {
		Workbook workbook = new XSSFWorkbook();

		// Sheet1: Customer Kullanıcı Bilgileri
		Sheet sheet1 = workbook.createSheet("Sheet1");
		Object[][] userData = {
				{"Kullanıcı Adı", "Şifre",},
				{"customer.oguzhan@gmail.com", "Bsc.0425"},
		};
		populateSheet(sheet1, userData);

		// Sheet2: Admin Kullanıcı Bilgileri
		Sheet sheet2 = workbook.createSheet("Sheet2");
		Object[][] adminData = {
				{"Kullanıcı Adı", "Şifre",},
				{"admin.oguzhan@buysellcycle.com", "Bsc.0425"},
		};
		populateSheet(sheet2, adminData);

		// Sheet3: Gecersiz Kullanıcı Bilgileri
		Sheet sheet3 = workbook.createSheet("Sheet3");
		Object[][] gecersizData = {
				{"Kullanıcı Adı", "Şifre",},
				{"gecersiz@gmail.com", "Bsc.0425"},
		};
		populateSheet(sheet3, gecersizData);

		// Excel dosyasını kaydet
		try (FileOutputStream fos = new FileOutputStream("src/test/resources/TestData.xlsx")) {
			workbook.write(fos);
			System.out.println("Excel dosyası başarıyla oluşturuldu: TestData.xlsx");
		} catch (IOException e) {
			System.err.println("Excel dosyası oluşturulurken hata meydana geldi: " + e.getMessage());
		}
	}

	private static void populateSheet(Sheet sheet, Object[][] data) {
		int rowCount = 0;
		for (Object[] rowData : data) {
			Row row = sheet.createRow(rowCount++);
			int columnCount = 0;
			for (Object field : rowData) {
				Cell cell = row.createCell(columnCount++);
				if (field instanceof String) {
					cell.setCellValue((String) field);
				} else if (field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}
	}
}
