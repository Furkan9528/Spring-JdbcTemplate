package com.furkankara;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.furkankara.dao.PersonelDao;
import com.furkankara.model.Personel;

public class Merkez {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDao personelDao = context.getBean("personelDaoBean",PersonelDao.class);

		Personel personel = new Personel();
		personel.setAdi("Ahmet");
		personel.setSoyadi("Mehmet");
		personel.setTecrube(4);
		
		
		//Personel personel = new Personel("Zeynep","KARA",12);
		
		//personelDao.ekle(personel)
		//System.out.println(personelDao.idAra(1));
		//System.out.println(personelDao.adiAra("furkan"));
		//System.out.println(personelDao.soyadiAra("KARA"));
		//System.out.println(personelDao.tecrubeAra(10));
		
		//personelDao.createOlusturPersonel(personel);
		
		//personelDao.readOkuPersonel(3);
		//personelDao.readOkuPersonelTecrube(5);
		
		personelDao.updateGuncellePersonel(personel, 7);
		
		//personelDao.deleteSilPersonel(6);
		context.close();
		
	}

}
