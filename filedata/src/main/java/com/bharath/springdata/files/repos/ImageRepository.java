package com.bharath.springdata.files.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.springdata.files.entities.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {

}
