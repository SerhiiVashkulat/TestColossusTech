package main.ua.shapoval.dto;

import main.ua.shapoval.model.Warehouse;

import java.util.List;

public class ResponseDto {
    List<Warehouse> list;
    int count;

    public List<Warehouse> getList() {
        return list;
    }

    public void setList(List<Warehouse> list) {
        this.list = list;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ResponseDto() {
    }

    public ResponseDto(List<Warehouse> list, int count) {
        this.list = list;
        this.count = count;
    }
}
