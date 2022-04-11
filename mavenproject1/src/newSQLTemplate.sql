/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  Acer
 * Created: Feb 24, 2022
 */
Create database mydata;
use mydata;
create table mytable{
Roll Integer primary key,
Name Varchar(30) ,
Marks Integer not null,
Grade Varchar(2)};


desc mytable;