package Controlador;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Admin;
import Modelo.Cliente;
import Modelo.ClienteDAO;

/**
 * Servlet implementation class Sv_Cliente
 */
@WebServlet("/Sv_Cliente")
public class Sv_Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClienteDAO clienteDAO = new ClienteDAO();
	Admin admin = new Admin();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sv_Cliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("entra por get ");
		
        listaDeUsuarios(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ruta = (request.getParameter("ruta")==null?"lista":request.getParameter("ruta"));
		Integer clienteId = Integer.parseInt(request.getParameter("clienteId"));
		HttpSession mySession = request.getSession();
		
		switch(ruta) {
			
		case "borrar":
			
			clienteDAO.delete(clienteId);
			listaDeUsuarios(request, response);
			break;
		case "editar" :
			
			
	        mySession.setAttribute("cliente", clienteDAO.buscarPorId(clienteId));
			response.sendRedirect("ActualizarCliente.jsp");
			
			break;
		case "actualizar" :
			
			
			Actualizar(request, response, clienteId);
			
			break;
		case "lista":
			listaDeUsuarios(request, response);
			break;
		case "registrar" :
			registrar(request, response);
			break;
		default :
			listaDeUsuarios(request, response);
			
		
	}}

	public void Actualizar(HttpServletRequest request, HttpServletResponse response, Integer clienteId)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String direccion = request.getParameter("direccion");
		String cedula = request.getParameter("cedula");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		System.out.print("el id es:"+clienteId);
		admin.registrarCliente(nombre,apellido, direccion,  cedula,  telefono,  correo);

		clienteDAO = admin.updateCliente(clienteDAO);
		
		listaDeUsuarios(request, response);
	}
	
	private void registrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String direccion = request.getParameter("direccion");
		String cedula = request.getParameter("cedula");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");


		admin.registrarCliente(nombre,apellido, direccion,  cedula,  telefono,  correo);
		ClienteDAO clienteDAO= admin.crearClienteDao();
		listaDeUsuarios(request, response);
		
		}
		
		private void listaDeUsuarios(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
			HttpSession mySession = request.getSession();
			List<Cliente> lsclientes = clienteDAO.getAllClientes();	
	        mySession.setAttribute("listaCli", lsclientes);              
	        response.sendRedirect("ListaUsuarios.jsp");		
		}
}