package com.sun.corba.se.spi.activation.RepositoryPackage;


/**
* com/sun/corba/se/spi/activation/RepositoryPackage/ServerDef.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /build/openjdk-8-wnL82d/openjdk-8-8u171-b11/src/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Friday, April 27, 2018 5:19:46 PM UTC
*/

public final class ServerDef implements org.omg.CORBA.portable.IDLEntity
{
  public String applicationName = null;

  // serverName values.
  public String serverName = null;

  // Class name of server's main class.
  public String serverClassPath = null;

  // class path used to run the server.
  public String serverArgs = null;
  public String serverVmArgs = null;

  public ServerDef ()
  {
  } // ctor

  public ServerDef (String _applicationName, String _serverName, String _serverClassPath, String _serverArgs, String _serverVmArgs)
  {
    applicationName = _applicationName;
    serverName = _serverName;
    serverClassPath = _serverClassPath;
    serverArgs = _serverArgs;
    serverVmArgs = _serverVmArgs;
  } // ctor

} // class ServerDef
