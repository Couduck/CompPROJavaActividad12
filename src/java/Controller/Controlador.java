/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author patoe
 */

import Config.Conexion;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Controlador 
{
    Conexion connect = new Conexion();
    JdbcTemplate template = new JdbcTemplate(connect.Conectar());
    ModelAndView MAV = new ModelAndView();
    
    @RequestMapping("/index")
    public ModelAndView ListadoCompleto()
    {
        String instruccion = "select * from triangulos";
        List datos = this.template.queryForList(instruccion);
        MAV.addObject("todosTriangulos", datos);
        MAV.setViewName("index");
        
        return MAV;
    }
}
