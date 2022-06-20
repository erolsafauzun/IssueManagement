package com.safauzun.issuemanagement.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {

    private int number; //ilgili anda kaçıncı sayfa gösteriliyor
    private int size; //kayıtlar kaçarlı gösteriliyor
    private Sort sort; // herhangi bir klona göre sıralama yapılacak
    private int totalPages; //toplam kaç sayfa mevcut
    private Long totalElements; //toplam kaç kayıt mevcut
    private List<T> content; //içerik datası

    public void setStat(Page page, List<T> list){

        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPages = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content = list;
    }

}
