package com.bharath.springdata.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springdata.files.entities.Image;
import com.bharath.springdata.files.repos.ImageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FiledataApplicationTests {

	@Autowired
	ImageRepository repository;

	@Test
	public void testImageSave() throws IOException {
		Image image = new Image();
		image.setId(1);
		image.setName("MAVEN.JPG");

		File file = new File("/Users/bharaththippireddy/Documents/Images/MAVEN.JPG");
		byte fileContent[] = new byte[(int) file.length()];
		FileInputStream inputStream = new FileInputStream(file);
		inputStream.read(fileContent);

		image.setData(fileContent);
		repository.save(image);
		inputStream.close();

	}

	@Test
	public void testReadImage() {
		Image image = repository.findById(1L).get();
		File file = new File("/Users/bharaththippireddy/Documents/Images/downloaded/" + image.getName());
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write(image.getData());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
