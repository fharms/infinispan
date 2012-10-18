/*
 * JBoss, Home of Professional Open Source
 * Copyright 2012 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @author tags. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.infinispan.configuration.as;

/**
 * OutboundSocketBinding.
 *
 * @author Tristan Tarrant
 * @since 5.2
 */
public class OutboundSocketBinding {
   private final String name;
   private final String host;
   private final int port;

   public OutboundSocketBinding(String name, String host, int port) {
      this.name = name;
      this.host = host;
      this.port = port;
   }

   public String name() {
      return name;
   }

   public String host() {
      return host;
   }

   public int port() {
      return port;
   }

   @Override
   public String toString() {
      return "OutboundSocketBinding [name=" + name + ", host=" + host + ", port=" + port + "]";
   }

}