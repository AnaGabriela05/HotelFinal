package edu.pe.idat.service;





import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Categoria;
import edu.pe.idat.model.Descuento;
import edu.pe.idat.model.Descuento_temporadaXcategoria;
import edu.pe.idat.model.Estado_Habitacion;
import edu.pe.idat.model.Habitacion;
import edu.pe.idat.model.ListarCategoriaxXxTemporada;
import edu.pe.idat.model.Listar_Habitacion;
import edu.pe.idat.model.Nivel;
import edu.pe.idat.model.Temporada;
import edu.pe.idat.repository.CategoriaRepository;
import edu.pe.idat.repository.DescuentoRepository;
import edu.pe.idat.repository.Descuento_temporadaXcategoriaRepository;
import edu.pe.idat.repository.EstadoRepository;
import edu.pe.idat.repository.HabitacionRepository;
import edu.pe.idat.repository.ListarCategoriaxXxTemporadaRepositoy;
import edu.pe.idat.repository.Listar_HabitacionRepository;
import edu.pe.idat.repository.NivelRepository;
import edu.pe.idat.repository.OperacionesCategoriaxXxTemporadaRepository;
import edu.pe.idat.repository.TemporadaRepository;



@Service
public class DescuentoService {


	@Autowired
	private DescuentoRepository repository_DESC;
	
	
	
	
	public List<Descuento> listar_descuento_id(String id){
		return repository_DESC.listar_descuento(id);
	}
	
	public List<Descuento> listar_descuento_categoria_id(String id){
		return repository_DESC.listar_descuento_categoria(id);
	}
	
	
	
	
	
	
	
}


