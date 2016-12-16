/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
@JsonDeserialize(builder = ListObjects.Builder.class)
public class ListObjects {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("objects")
        private List<ObjectSummary> objects;

        @JsonProperty("prefixes")
        private List<String> prefixes;

        @JsonProperty("nextStartWith")
        private String nextStartWith;

        public ListObjects build() {
            return new ListObjects(objects, prefixes, nextStartWith);
        }

        @JsonIgnore
        public Builder copy(ListObjects o) {
            return objects(o.getObjects())
                    .prefixes(o.getPrefixes())
                    .nextStartWith(o.getNextStartWith());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("objects")
    @Valid
    @NotNull
    List<ObjectSummary> objects;

    @JsonProperty("prefixes")
    List<String> prefixes;

    /**
     * The name of the object to be used in startWith parameter to obtain next page of
     * a truncated list objects response.
     *
     **/
    @JsonProperty("nextStartWith")
    String nextStartWith;
}
