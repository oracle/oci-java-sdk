/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * An extension of the existing record resource, describing either a
 * precondition, an add, or a remove. Preconditions check all fields,
 * including read-only data like `recordHash` and `rrsetVersion`.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecordOperation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RecordOperation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
        private String recordHash;

        public Builder recordHash(String recordHash) {
            this.recordHash = recordHash;
            this.__explicitlySet__.add("recordHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
        private Boolean isProtected;

        public Builder isProtected(Boolean isProtected) {
            this.isProtected = isProtected;
            this.__explicitlySet__.add("isProtected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rdata")
        private String rdata;

        public Builder rdata(String rdata) {
            this.rdata = rdata;
            this.__explicitlySet__.add("rdata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
        private String rrsetVersion;

        public Builder rrsetVersion(String rrsetVersion) {
            this.rrsetVersion = rrsetVersion;
            this.__explicitlySet__.add("rrsetVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rtype")
        private String rtype;

        public Builder rtype(String rtype) {
            this.rtype = rtype;
            this.__explicitlySet__.add("rtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecordOperation build() {
            RecordOperation __instance__ =
                    new RecordOperation(
                            domain,
                            recordHash,
                            isProtected,
                            rdata,
                            rrsetVersion,
                            rtype,
                            ttl,
                            operation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecordOperation o) {
            Builder copiedBuilder =
                    domain(o.getDomain())
                            .recordHash(o.getRecordHash())
                            .isProtected(o.getIsProtected())
                            .rdata(o.getRdata())
                            .rrsetVersion(o.getRrsetVersion())
                            .rtype(o.getRtype())
                            .ttl(o.getTtl())
                            .operation(o.getOperation());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The fully qualified domain name where the record can be located.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * A unique identifier for the record within its zone.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordHash")
    String recordHash;

    /**
     * A Boolean flag indicating whether or not parts of the record
     * are unable to be explicitly managed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isProtected")
    Boolean isProtected;

    /**
     * The record's data, as whitespace-delimited tokens in
     * type-specific presentation format. All RDATA is normalized and the
     * returned presentation of your RDATA may differ from its initial input.
     * For more information about RDATA, see [Supported DNS Resource Record Types](https://docs.cloud.oracle.com/iaas/Content/DNS/Reference/supporteddnsresource.htm)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rdata")
    String rdata;

    /**
     * The latest version of the record's zone in which its RRSet differs
     * from the preceding version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rrsetVersion")
    String rrsetVersion;

    /**
     * The canonical name for the record's type, such as A or CNAME. For more
     * information, see [Resource Record (RR) TYPEs](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rtype")
    String rtype;

    /**
     * The Time To Live for the record, in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;
    /**
     * A description of how a record relates to a PATCH operation.
     * <p>
     *
     * - `REQUIRE` indicates a precondition that record data **must** already exist.
     * - `PROHIBIT` indicates a precondition that record data **must not** already exist.
     * - `ADD` indicates that record data **must** exist after successful application.
     * - `REMOVE` indicates that record data **must not** exist after successful application.
     * <p>
     *
     *   **Note:** `ADD` and `REMOVE` operations can succeed even if
     *   they require no changes when applied, such as when the described
     *   records are already present or absent.
     * <p>
     *
     *   **Note:** `ADD` and `REMOVE` operations can describe changes for
     *   more than one record.
     * <p>
     *
     *   **Example:** `{ \"domain\": \"www.example.com\", \"rtype\": \"AAAA\", \"ttl\": 60 }`
     *   specifies a new TTL for every record in the www.example.com AAAA RRSet.
     *
     **/
    public enum Operation {
        Require("REQUIRE"),
        Prohibit("PROHIBIT"),
        Add("ADD"),
        Remove("REMOVE"),
        ;

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operation: " + key);
        }
    };
    /**
     * A description of how a record relates to a PATCH operation.
     * <p>
     *
     * - `REQUIRE` indicates a precondition that record data **must** already exist.
     * - `PROHIBIT` indicates a precondition that record data **must not** already exist.
     * - `ADD` indicates that record data **must** exist after successful application.
     * - `REMOVE` indicates that record data **must not** exist after successful application.
     * <p>
     *
     *   **Note:** `ADD` and `REMOVE` operations can succeed even if
     *   they require no changes when applied, such as when the described
     *   records are already present or absent.
     * <p>
     *
     *   **Note:** `ADD` and `REMOVE` operations can describe changes for
     *   more than one record.
     * <p>
     *
     *   **Example:** `{ \"domain\": \"www.example.com\", \"rtype\": \"AAAA\", \"ttl\": 60 }`
     *   specifies a new TTL for every record in the www.example.com AAAA RRSet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Operation operation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
