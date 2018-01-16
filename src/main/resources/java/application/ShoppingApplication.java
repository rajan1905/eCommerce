package application;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import customer.CustomerResourceService;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class ShoppingApplication extends Application 
{
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();
	
	public ShoppingApplication() 
	{
		singletons.add(new CustomerResourceService());
	}
	
	@Override
	public Set<Class<?>> getClasses() 
	{
		return empty;
	}
	
	@Override
	public Set<Object> getSingletons() 
	{
		return singletons;
	}
}