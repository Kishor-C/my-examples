package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Project;

public interface ProjectDao extends JpaRepository<Project, Integer>{

}
