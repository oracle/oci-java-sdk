/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

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
@JsonDeserialize(builder = ObjectSummary.Builder.class)
public class ObjectSummary {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        @JsonProperty("size")
        private Long size;

        @JsonProperty("md5")
        private String md5;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        public ObjectSummary build() {
            return new ObjectSummary(name, size, md5, timeCreated);
        }

        @JsonIgnore
        public Builder copy(ObjectSummary o) {
            return name(o.getName())
                    .size(o.getSize())
                    .md5(o.getMd5())
                    .timeCreated(o.getTimeCreated());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the object.
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * Size of the object in bytes.
     **/
    @JsonProperty("size")
    Long size;

    /**
     * Base64 encoded MD5 hash of the object data.
     **/
    @JsonProperty("md5")
    String md5;

    /**
     * Date and time of object creation.
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
}
