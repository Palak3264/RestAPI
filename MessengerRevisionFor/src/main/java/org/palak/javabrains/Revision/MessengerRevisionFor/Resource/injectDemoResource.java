package org.palak.javabrains.Revision.MessengerRevisionFor.Resource;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;


@Path("/injectDemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)

public class injectDemoResource {

@Path("annotations")
@GET
public String getParamAnnotations(@MatrixParam("param") String matrixParam)
{
	return matrixParam;
}

@Path("contextDemo")
@GET
public String getContext(@Context UriInfo uriInfo)
{
	return uriInfo.getBaseUri().toString();
}
}
