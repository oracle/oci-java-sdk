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

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateDrgAttachmentDetails.Builder.class)
public class CreateDrgAttachmentDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("drgId")
        private String drgId;

        @JsonProperty("vcnId")
        private String vcnId;

        public CreateDrgAttachmentDetails build() {
            return new CreateDrgAttachmentDetails(displayName, drgId, vcnId);
        }

        @JsonIgnore
        public Builder copy(CreateDrgAttachmentDetails o) {
            return displayName(o.getDisplayName()).drgId(o.getDrgId()).vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The OCID of the DRG.
     **/
    @JsonProperty("drgId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String drgId;

    /**
     * The OCID of the VCN.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}
