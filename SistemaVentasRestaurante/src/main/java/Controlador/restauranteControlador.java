package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Modelo.Cliente;
import Modelo.ClienteDAO;

/**
 * Servlet implementation class restauranteControlador
 */
@WebServlet("/restauranteControlador")
public class restauranteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ClienteDAO clienteDAO= new ClienteDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public restauranteControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException


 {
		// TODO Auto-generated method stub
		ruteador(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		ruteador(request,response);
	}
	
	private void ruteador(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String ruta = (request.getParameter("ruta")==null?"ver":request.getParameter("ruta"));
		switch(ruta) {

		case "GuardarCliente":
			this.registrar(request, response);
			break;
			
		case "RegistrarPedido":
			//implementacion de registrar pedido
			break;
		case "MostrarPedidos" :
			//implementacion de pedidos	
			break ;
		default:
			this.listaDeUsuarios(request, response);
		}
	}
	private void RegistroCliente(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
					
			    request.getRequestDispatcher("/RegistrarCliente.jsp").forward(request, response);
	}
	
	private void registrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
				
	}
	private void listaDeUsuarios(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		HttpSession mySession = request.getSession();
		List<Cliente> lsclientes = clienteDAO.getAllClientes();	
        mySession.setAttribute("listaCli", lsclientes);              
        response.sendRedirect("ListaUsuarios.jsp");		
	}
}
