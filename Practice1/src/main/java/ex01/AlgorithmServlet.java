package ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Algorithm")
public class AlgorithmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlgorithmServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = "", pwd = "", email = "";
		Boolean isLogon = false;
		HttpSession session = request.getSession(false);

		if (session != null) {
			isLogon = (Boolean) session.getAttribute("isLogon");
			if (isLogon == true) {
				id = (String) session.getAttribute("login.id");
				pwd = (String) session.getAttribute("login.pw");

				String style = request.getParameter("style");
				String engine_type = request.getParameter("engine_type");
				String transmission = request.getParameter("transmission");
				String option = request.getParameter("option");

				String car = "null";

				if (style.equals("sedan")) {
					if (engine_type.equals("gasoline")) {
						if (transmission.equals("auto")) {
							car = "sonata";
							response.sendRedirect("cars/sonata.jsp");
						} else if (transmission.equals("dct")) {

						} else if (transmission.equals("manual")) {
							car = "stonic";
							response.sendRedirect("cars/stonic.jsp");
						} else if (transmission.equals("cvt")) {
							car = "avante";
							response.sendRedirect("cars/avante.jsp");
						}
					} else if (engine_type.equals("gasoline_turbo")) {
						if (transmission.equals("auto")) {
							car = "stinger";
							response.sendRedirect("cars/stinger.jsp");
						} else if (transmission.equals("dct")) {
							car = "avante";
							response.sendRedirect("cars/avante.jsp");
						} else if (transmission.equals("manual")) {
							car = "avante";
							response.sendRedirect("cars/avante.jsp");
						} else if (transmission.equals("cvt")) {

						}
					} else if (engine_type.equals("disel")) {
						if (transmission.equals("auto")) {
							car = "stinger";
							response.sendRedirect("cars/stinger.jsp");
						} else if (transmission.equals("dct")) {
							car = "k5";
							response.sendRedirect("cars/k5.jsp");
						} else if (transmission.equals("manual")) {
							car = "cruze";
							response.sendRedirect("cars/cruze.jsp");
						} else if (transmission.equals("cvt")) {

						}
					} else if (engine_type.equals("lpg")) {

					} else if (engine_type.equals("hybrid")) {
						if (transmission.equals("auto")) {
							car = "k8";
							response.sendRedirect("cars/k8.jsp");
						} else if (transmission.equals("dct")) {
							car = "avante";
							response.sendRedirect("cars/avante.jsp");
						} else if (transmission.equals("manual")) {

						} else if (transmission.equals("cvt")) {
							car = "avante";
							response.sendRedirect("cars/avante.jsp");
						}
					} else if (engine_type.equals("ev")) {
						car = "eg80";
						response.sendRedirect("cars/eg80.jsp");
					}
				} else if (style.equals("suv")) {
					if (engine_type.equals("gasoline")) {
						if (transmission.equals("auto")) {
							car = "qm6";
							response.sendRedirect("cars/qm6.jsp");
						} else if (transmission.equals("dct")) {

						} else if (transmission.equals("manual")) {
							
						} else if (transmission.equals("cvt")) {
							
						}
					} else if (engine_type.equals("gasoline_turbo")) {
						if (transmission.equals("auto")) {
							car = "santafe";
							response.sendRedirect("cars/santafe.jsp");
						} else if (transmission.equals("dct")) {
							car = "sportage";
							response.sendRedirect("cars/sportage.jsp");
						} else if (transmission.equals("manual")) {
							car = "seltos";
							response.sendRedirect("cars/seltos.jsp");
						} else if (transmission.equals("cvt")) {

						}
					} else if (engine_type.equals("disel")) {
						if (transmission.equals("auto")) {
							car = "palisade";
							response.sendRedirect("cars/palisade.jsp");
						} else if (transmission.equals("dct")) {
							car = "santafe";
							response.sendRedirect("cars/santafe.jsp");
						} else if (transmission.equals("manual")) {
							car = "tivoli";
							response.sendRedirect("cars/tivoli.jsp");
						} else if (transmission.equals("cvt")) {

						}
					} else if (engine_type.equals("lpg")) {
							car = "qm6";
							response.sendRedirect("cars/qm6.jsp");
					} else if (engine_type.equals("hybrid")) {
						if (transmission.equals("auto")) {
							car = "sorento";
							response.sendRedirect("cars/sorento.jsp");
						} else if (transmission.equals("dct")) {
							car = "kona";
							response.sendRedirect("cars/kona.jsp");
						} else if (transmission.equals("manual")) {

						} else if (transmission.equals("cvt")) {
							
						}
					} else if (engine_type.equals("ev")) {
						car = "korando";
						response.sendRedirect("cars/korando.jsp");
					}
				} else if (style.equals("hatch")) {
					if (engine_type.equals("gasoline")) {
						if (transmission.equals("auto")) {
							car = "morning";
							response.sendRedirect("cars/morning.jsp");
						} else if (transmission.equals("dct")) {
							car = "morning";
							response.sendRedirect("cars/morning.jsp");
						} else if (transmission.equals("manual")) {
							car = "spark";
							response.sendRedirect("cars/spark.jsp");
						} else if (transmission.equals("cvt")) {
							car = "spark";
							response.sendRedirect("cars/spark.jsp");
						}
					} else if (engine_type.equals("gasoline_turbo")) {
						if (transmission.equals("auto")) {
							car = "morning";
							response.sendRedirect("cars/morning.jsp");
						} else if (transmission.equals("dct")) {
							car = "veloster";
							response.sendRedirect("cars/veloster.jsp");
						} else if (transmission.equals("manual")) {
							car = "veloster";
							response.sendRedirect("cars/veloster.jsp");
						} else if (transmission.equals("cvt")) {

						}
					} else if (engine_type.equals("disel")) {
						if (transmission.equals("auto")) {
							car = "i30";
							response.sendRedirect("cars/i30.jsp");
						}
					} else if (engine_type.equals("lpg")) {
							
					} else if (engine_type.equals("hybrid")) {
						if (transmission.equals("auto")) {
							car="ioniq";
							response.sendRedirect("cars/ioniq.jsp");
						}
					} else if (engine_type.equals("ev")) {
						car = "korando";
						response.sendRedirect("cars/korando.jsp");
					}
				} else if (style.equals("wagon")) {
					car="i40";
					response.sendRedirect("cars/i40.jsp");
				} else if (style.equals("rv")) {
					if (engine_type.equals("gasoline")) {
							car="carnival";
							response.sendRedirect("cars/carnival.jsp");
					}else if (engine_type.equals("gasoline_turbo")) {
						
					} else if (engine_type.equals("disel")) {
						if (transmission.equals("auto")) {
							car = "carnival";
							response.sendRedirect("cars/carnival.jsp");
						} else if (transmission.equals("manual")) {
							car = "staria";
							response.sendRedirect("cars/staria.jsp");
						} 
					} 
				} else if (style.equals("coupe")) {
					
				} else if (style.equals("business")) {
					car="truck";
					response.sendRedirect("cars/truck.jsp");
				} else {
//					System.out.print("alert(\"nodata\")");
					response.sendRedirect("main.jsp");
				}
				out.close();

			} else {
				response.sendRedirect("main.jsp");
			}
		} else {
			response.sendRedirect("main.jsp");
		}
	}
}
