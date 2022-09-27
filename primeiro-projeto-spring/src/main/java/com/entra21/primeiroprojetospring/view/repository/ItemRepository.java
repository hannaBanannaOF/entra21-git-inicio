package com.entra21.primeiroprojetospring.view.repository;

import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    public List<ItemEntity> findAllByTituloContaining(String titulo);
    public List<ItemEntity> findAllByFranquia_IdAndTituloContaining(Long idFranquia, String titulo);
    public List<ItemEntity> findAllByFranquia_Id(Long idFranquia);
}
