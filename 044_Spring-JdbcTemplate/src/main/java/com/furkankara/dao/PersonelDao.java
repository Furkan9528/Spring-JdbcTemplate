package com.furkankara.dao;

import com.furkankara.model.Personel;

public interface PersonelDao {

	
	public void ekle(Personel personel);
	
	public Personel idAra(int id);
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeAra(int tecrube);
	
	
	public void createOlusturPersonel(Personel personel);
	public Personel readOkuPersonel(int id);
	public Personel readOkuPersonelTecrube(int tecrube);
	public void updateGuncellePersonel(Personel personel,int id);
	public void deleteSilPersonel(int id);

	
	//public Personel personelAra(int id, String adi, int tecrube);

}
