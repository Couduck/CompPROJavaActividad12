/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Config.Conexion;
import Entidad.Triangulo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author patoe
 */

@Controller
@RequestMapping("/controlInsert")
public class ControladorInsert 
{
    Conexion connect = new Conexion();
    JdbcTemplate template = new JdbcTemplate(connect.Conectar());
    ModelAndView MAV = new ModelAndView();
    
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView Agregar()
    {
        MAV.addObject(new Triangulo());
        MAV.setViewName("agregar");
        return MAV;
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView Agregar(@RequestParam("altura") String straltura, @RequestParam("base") String strbase, Model modelo)
    {  
        try
        {
            Float altura = Float.parseFloat(straltura);
            Float base = Float.parseFloat(strbase);
            
            if(altura <= 0 || base <= 0)
            {
                modelo.addAttribute("mensajeError","Uno de los valores es igual o menor a 0");
                MAV.setViewName("error");
                return MAV; 
            }
            
            else
            {
               Triangulo t = new Triangulo(base, altura);
               String instruccion = "insert into triangulos(base, altura, perimetro, area)values(?,?,?,?)";
               this.template.update(instruccion, t.getBase(), t.getAltura(), t.getPerimetro(), t.getArea());
               return new ModelAndView("redirect:/index.htm");  
            }
             
        }
        
        catch(NullPointerException a)
        {
            modelo.addAttribute("mensajeError","Faltaron datos por ingresarse");
            MAV.setViewName("error");
            return MAV;  
        }
        
        catch(NumberFormatException b)
        {
            modelo.addAttribute("mensajeError","Alguno de los valores ingresados no pudo convertirse a una variable de tipo Float");
            MAV.setViewName("error");
            return MAV; 
        }
        
        
          
    }
}
