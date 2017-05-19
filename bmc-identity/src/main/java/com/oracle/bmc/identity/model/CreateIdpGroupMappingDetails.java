/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateIdpGroupMappingDetails.Builder.class)
public class CreateIdpGroupMappingDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("idpGroupName")
        private String idpGroupName;

        @JsonProperty("groupId")
        private String groupId;

        public CreateIdpGroupMappingDetails build() {
            return new CreateIdpGroupMappingDetails(idpGroupName, groupId);
        }

        @JsonIgnore
        public Builder copy(CreateIdpGroupMappingDetails o) {
            return idpGroupName(o.getIdpGroupName()).groupId(o.getGroupId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the IdP group you want to map.
     **/
    @JsonProperty("idpGroupName")
    @Valid
    @NotNull
    String idpGroupName;

    /**
     * The OCID of the IAM Service {@link Group}
     * you want to map to the IdP group.
     *
     **/
    @JsonProperty("groupId")
    @Valid
    @NotNull
    String groupId;
}
