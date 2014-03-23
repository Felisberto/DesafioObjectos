package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cep = request.getParameter("cep"); 
	
		
		String url = "http://www.buscacep.correios.com.br/servicos/dnec/consultaEnderecoAction.do?relaxation="+ cep +"&TipoCep=LOG&semelhante=N&cfm=1&Metodo=listaLogradouro&TipoConsulta=relaxation&StartRow=1&EndRow=10";
		
		HttpSession ses = request.getSession();
		ses.setAttribute("URL", url);
		
	
		response.sendRedirect("./resposta.jsp");
		
		
		

		
	}



}
