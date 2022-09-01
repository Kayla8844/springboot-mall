package com.kayla.springbootmall.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BuyItem {
    @NonNull
    private Integer productId;

    @NonNull
    private Integer quantity;
}
