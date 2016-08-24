package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="TABLE2")
//@NamedQuery(name = "Table2.findAllData", query="select id,table1id,value from Table2")
public class Table2 {
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;

	@Column(name="TABLE1ID")
	private Integer table1id;

	@Column(name="VALUE")
	private String value;

	public Table2() {
		super();
	}

	public Table2(Integer id, Integer table1id, String value){
		super();
		this.id = id;
		this.table1id = table1id;
		this.value = value;
//		this.setTableId(table1id);
//		this.setValue(value);

	}

	public void setId (Integer id){
		this.id = id;
	}

	public Integer getId () {
		return this.id;
	}

	public void setTableId (Integer tableid){
		this.table1id = tableid;
	}

	public Integer getTableId (){
		return this.table1id;
	}

	public void setValue (String value){
		this.value = value;
	}

	public String getValue (){
		return this.value;
	}
}