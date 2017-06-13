package by.htp.travelserviceWEB.service;

public class RoleServiceImpl implements RoleService {

private RoleServiceImpl() {}

private static class Singletone{
private static final RoleServiceImpl INSTANCE = new RoleServiceImpl();
	}

public static RoleServiceImpl getInstance() {
return Singletone.INSTANCE;
}
}