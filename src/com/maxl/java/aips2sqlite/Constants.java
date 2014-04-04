/*
Copyright (c) 2014 Max Lungarella

This file is part of Aips2SQLite.

Aips2SQLite is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package com.maxl.java.aips2sqlite;

public class Constants {
	// XML and XSD files to be parsed (contains DE and FR -> needs to be extracted)
	public static final String FILE_MEDICAL_INFOS_XML = "./downloads/aips_xml.xml";
	public static final String FILE_MEDICAL_INFOS_XSD = "./downloads/aips_xsd.xsd";
	// Excel file to be parsed (DE = FR)
	public static final String FILE_PACKAGES_XLS = "./downloads/swissmedic_packages_xls.xls";
	public static final String FILE_PACKAGES_XLSX = "./downloads/swissmedic_packages_xlsx.xlsx";
	// Refdata xml file to be parsed (DE != FR)
	public static final String FILE_REFDATA_PHARMA_DE_XML = "./downloads/refdata_pharma_de_xml.xml";
	public static final String FILE_REFDATA_PHARMA_FR_XML = "./downloads/refdata_pharma_fr_xml.xml";
	// BAG xml file to be parsed (contains DE and FR)
	public static final String FILE_PREPARATIONS_XML = "./downloads/bag_preparations_xml.xml";
	// Swiss DRG xlsx file to be parsed (DE != FR)
	public static final String FILE_SWISS_DRG_DE_XLSX = "./downloads/swiss_drg_de_xlsx.xlsx";
	public static final String FILE_SWISS_DRG_FR_XLSX = "./downloads/swiss_drg_fr_xlsx.xlsx";
	// ****** ATC class xls file (DE != FR) ******
	public static final String FILE_ATC_CLASSES_XLS = "./input/wido_arz_amtl_atc_index_0113_xls.xls";
	public static final String FILE_ATC_MULTI_LINGUAL_TXT = "./input/atc_codes_multi_lingual.txt";
	// CSS style sheets
	public static final String FILE_STYLE_CSS_BASE = "./css/amiko_stylesheet_";
	public static final String FILE_REPORT_CSS_BASE = "./css/report_stylesheet";
	// ****** Parse reports (DE != FR) ******
	public static final String FILE_PARSE_REPORT = "./output/parse_report";
	public static final String FILE_OWNER_REPORT = "./output/owner_report";
	public static final String FILE_INDICATIONS_REPORT = "./output/indications_report";
	// ****** XML file ******
	public static final String FI_FILE_XML_BASE = "./output/fis/";
	public static final String PI_FILE_XML_BASE = "./output/pis/";
	// ****** Stop words (DE != FR) ******
	public static final String FILE_STOP_WORDS_DE = "./input/german_stop_words.txt";
	public static final String FILE_STOP_WORDS_FR = "./input/french_stop_words.txt";
	
	// Version of the generated database 
	public static final String FI_DB_VERSION = "1.2.8";	
	public static final String PI_DB_VERSION = "1.0.0";
}