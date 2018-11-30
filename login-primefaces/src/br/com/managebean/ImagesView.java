package br.com.managebean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean (name = "imagesView")
public class ImagesView {
     
    private List<String> images;
    private String option;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        livrosHarryPotter();
        livrosSrDosAneis();
    }

	private void livrosHarryPotter() {
		for (int i = 1; i <= 7; i++) {
            images.add("Livro " + i + " Harry Potter.png");
        }
	}
	
	private void livrosSrDosAneis() {
		for (int i = 1; i <= 3; i++) {
            images.add("Livro " + i + " Senhor dos Aneis.png");
        }
	}
	
    public List<String> getImages() {
        return images;
    }

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		String mensagem = "";
		
		if(option != null && !option.equals("")) {
			images = new ArrayList<String>();
			if(option.equals("Harry Potter")) {
				livrosHarryPotter();
			} else if(option.equals("Senhor dos Aneis")) {
				livrosSrDosAneis();
			}
			mensagem = "Livros selecionados com sucesso.";
		}else {
			mensagem = "Todos os livros selecionados.";
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", mensagem));
		this.option = option;
	}
}
