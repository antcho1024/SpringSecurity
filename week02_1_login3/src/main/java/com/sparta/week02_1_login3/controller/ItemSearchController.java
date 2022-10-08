package com.sparta.week02_1_login3.controller;

import com.sparta.week02_1_login3.dto.ItemDto;
import com.sparta.week02_1_login3.service.ItemSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class ItemSearchController {

    private final ItemSearchService itemSearchService;

    @GetMapping("/api/search")
    @ResponseBody
    public List<ItemDto> getItems(@RequestParam String query) throws IOException {
        return itemSearchService.getItems(query);
    }
}