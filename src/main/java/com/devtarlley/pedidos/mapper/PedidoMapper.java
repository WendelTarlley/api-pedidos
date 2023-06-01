package com.devtarlley.pedidos.mapper;

import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.model.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PedidoMapper {

    PedidoMapper INSTANCE = Mappers.getMapper(PedidoMapper.class);

    PedidoDTO entityToDto(Pedido pedido);

    Pedido dtoToEntity(PedidoDTO pedidoDTO);
}
