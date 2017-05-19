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
@JsonDeserialize(builder = UpdateIdpGroupMappingDetails.Builder.class)
public class UpdateIdpGroupMappingDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("idpGroupName")
        private String idpGroupName;

        @JsonProperty("groupId")
        private String groupId;

        public UpdateIdpGroupMappingDetails build() {
            return new UpdateIdpGroupMappingDetails(idpGroupName, groupId);
        }

        @JsonIgnore
        public Builder copy(UpdateIdpGroupMappingDetails o) {
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
     * The idp group name.
     **/
    @JsonProperty("idpGroupName")
    String idpGroupName;

    /**
     * The OCID of the group.
     **/
    @JsonProperty("groupId")
    String groupId;
}
