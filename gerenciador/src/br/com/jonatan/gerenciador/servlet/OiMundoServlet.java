/**
 * Essa classe é um servlet
 * Utilizará "extends"
 */

package br.com.jonatan.gerenciador.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

//oi
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {

	@Override // void não retorna
	public void service(ServletRequest req, ServletResponse resp) throws IOException{

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("oi mundo, vc escreveu o 1º servlet");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OiMundoServlet foi chamado");
	}
}
