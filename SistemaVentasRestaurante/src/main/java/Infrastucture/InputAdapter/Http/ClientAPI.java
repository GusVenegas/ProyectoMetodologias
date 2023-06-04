package Infrastucture.InputAdapter.Http;

import Aplication.ClienteUseCase;
import Domain.Cliente;
import Domain.ClienteDAO;
import Infrastucture.InputPort.IClientInputPort;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientAPI
 */
@WebServlet(urlPatterns = "/ClientAPI", name = "ClientAPI")
public class ClientAPI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientAPI() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("metodo get ");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String direccion = request.getParameter("direccion");
		String cedula = request.getParameter("cedula");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");

		//2.- LLamo al Modelo


		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDireccion(direccion);
		cliente.setCedula(cedula);
		cliente.setTelefono(telefono);
		cliente.setCorreo(correo);
		ClienteDAO clienteDAO= new ClienteDAO();
		clienteDAO.create(cliente);

		//doGet(request, response);
	}

}
