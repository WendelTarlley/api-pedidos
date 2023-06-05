package com.devtarlley.pedidos.mapper;

import com.devtarlley.pedidos.dto.ClienteDTO;
import com.devtarlley.pedidos.dto.PedidoDTO;
import com.devtarlley.pedidos.dto.PedidoRetornoDTO;
import com.devtarlley.pedidos.model.Cliente;
import com.devtarlley.pedidos.model.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

   Cliente dtoToEntity(ClienteDTO clienteDTO);
   ClienteDTO entityToDto(Cliente cliente);

   List<Cliente> dtoToEntity(List<ClienteDTO> clienteDTOList);
   List<ClienteDTO> entityToDto(List<Cliente> clienteList);
}
