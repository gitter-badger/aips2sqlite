package com.maxl.java.aips2sqlite;

public class Article {

	public String pack_title = "";		// Artikelname
	public String pack_unit = "";		// Dosierung
	public String ean_code = "";		// Strichcode
	public String regnr = "";
	public String pharma_code = "";
	public String atc_code = "";	
	public String atc_class = "";
	public String therapy_code = "";	
	public String galen_form = "";
	public String rose_supplier = "";
	public String availability = "";
	public String rose_base_price = "";
	public int pack_size = 0;			// Packungsinhalt
	public int stock = 0;
	public int likes = 0;
		
	Article() {
		// Struct-like class... 'nough said.
	}
}
