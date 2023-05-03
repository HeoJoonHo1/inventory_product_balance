package com.ipb.domain;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Sales {
    private Long id;
    private Integer qnt;
    private Long product_id;
    private Long store_id;
    private Date sales_date;
}