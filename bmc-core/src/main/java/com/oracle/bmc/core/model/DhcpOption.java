/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A single DHCP option according to [RFC 1533](https://tools.ietf.org/html/rfc1533).
 * The two options available to use are {@link DhcpDnsOption}
 * and {@link DhcpSearchDomainOption}. For more
 * information, see [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm)
 * and [Managing DHCP Options](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingDHCP.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@NonFinal
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DhcpOption.class
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DhcpDnsOption.class, name = "DomainNameServer"),
    @JsonSubTypes.Type(value = DhcpSearchDomainOption.class, name = "SearchDomain")
})
public class DhcpOption {}
