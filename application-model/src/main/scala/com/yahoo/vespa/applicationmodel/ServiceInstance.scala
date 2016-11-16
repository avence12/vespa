// Copyright 2016 Yahoo Inc. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.vespa.applicationmodel

/**
 * @author bakksjo
 */
case class ServiceInstance[S](configId: ConfigId, hostName: HostName, serviceStatus: S)