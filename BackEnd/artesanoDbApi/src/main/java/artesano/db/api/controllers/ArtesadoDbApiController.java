package artesano.db.api.controllers;

import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import artesano.db.api.repositories.APVentasRepository;
import artesano.db.api.repositories.ApCatClasificacionProductosRepository;
import artesano.db.api.repositories.ApCatClientesRepository;
import artesano.db.api.repositories.ApCatMateriaPrimaRepository;
import artesano.db.api.repositories.ApCatProductosRepository;
import artesano.db.api.repositories.ApCatPuntosVentaRepository;
import artesano.db.api.repositories.ApCatUsuariosRepository;
import artesano.db.api.repositories.ApDetalleVentasRepository;
import artesano.db.api.repositories.ApHistoricoProductoPrecioRepository;
import artesano.db.api.repositories.ApRegistroMateriaPrimaRepository;
import artesano.db.api.repositories.ApSesionesUsuarioRepository;

@RestController
public class ArtesadoDbApiController {
	
	private ApCatClasificacionProductosRepository catClasificacionProd;
	private ApCatClientesRepository catClientes;
	private ApCatMateriaPrimaRepository catMatPrima;
	private ApCatProductosRepository catProductos;
	private ApCatPuntosVentaRepository catPuntosVentas;
	private ApCatUsuariosRepository catUsuarios;
	private ApDetalleVentasRepository catDetalleVentas;
	private ApHistoricoProductoPrecioRepository histProductosPrecio; 
	private ApRegistroMateriaPrimaRepository registroMatPrima;
	private ApSesionesUsuarioRepository sesionesUsuario;
	private APVentasRepository ventas;
	
	public ResponseEntity<?> getAllCatClasificacionProductos(){
		return ResponseEntity.ok().cacheControl(CacheControl.noCache()).body(catClasificacionProd.findAll());
	}
}
