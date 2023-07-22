package designpatterns.creational.abstractfactory.example1;


public interface AbstractWidgetFactory {

	public Window createWindow();
	public Scroll createScroll();
	public Button[] createNavigationButtons();
	
}
