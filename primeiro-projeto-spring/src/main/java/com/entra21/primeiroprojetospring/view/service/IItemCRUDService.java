package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.ItemPayloadDTO;

public interface IItemCRUDService<PAYLOAD> {

    public void adicionar(PAYLOAD payload);
}
