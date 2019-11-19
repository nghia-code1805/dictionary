package controller;

import org.springframework.stereotype.Controller;
import models.dictionary;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.DS_mpl;
import java.util.List;

@Controller
public class dictionController {

    private DS_mpl ds=new DS_mpl();
    @GetMapping("/search")
    public String search(){
        return "dsindex";
    }
    @PostMapping("/result")
    public String meaning(@RequestParam String keyword, Model model){
        List<dictionary> dictionaries =this.ds.findAll();
        for (int i=0;i < dictionaries.size();i++){
            if (keyword.equalsIgnoreCase(dictionaries.get(i).getEn())){
                model.addAttribute("word",dictionaries.get(i).getVn());
                model.addAttribute("key",keyword);
                return "mean";
            }
        }
        return "mean";
    }
}
