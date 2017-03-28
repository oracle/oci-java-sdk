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

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
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

    /**
     * An array of object summaries.
     *
     **/
    @JsonProperty("objects")
    @Valid
    @NotNull
    List<ObjectSummary> objects;

    /**
     * Prefixes that are common to the results returned by the request if the request specified a delimiter.
     *
     **/
    @JsonProperty("prefixes")
    List<String> prefixes;

    /**
     * The name of the object to use in the 'startWith' parameter to obtain the next page of
     * a truncated ListObjects response.
     *
     **/
    @JsonProperty("nextStartWith")
    String nextStartWith;
}
