/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to fetch the Sql tuning set details. It takes either credentialDetails or
 * databaseCredential. It's recommended to provide databaseCredential <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FetchSqlTuningSetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FetchSqlTuningSetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "credentialDetails",
        "databaseCredential",
        "owner",
        "name",
        "basicFilter",
        "recursiveSql",
        "resultPercentage",
        "resultLimit",
        "rankingMeasure1",
        "rankingMeasure2",
        "rankingMeasure3"
    })
    public FetchSqlTuningSetDetails(
            SqlTuningSetAdminCredentialDetails credentialDetails,
            DatabaseCredentialDetails databaseCredential,
            String owner,
            String name,
            String basicFilter,
            RecursiveSql recursiveSql,
            Double resultPercentage,
            Integer resultLimit,
            RankingMeasure rankingMeasure1,
            RankingMeasure rankingMeasure2,
            RankingMeasure rankingMeasure3) {
        super();
        this.credentialDetails = credentialDetails;
        this.databaseCredential = databaseCredential;
        this.owner = owner;
        this.name = name;
        this.basicFilter = basicFilter;
        this.recursiveSql = recursiveSql;
        this.resultPercentage = resultPercentage;
        this.resultLimit = resultLimit;
        this.rankingMeasure1 = rankingMeasure1;
        this.rankingMeasure2 = rankingMeasure2;
        this.rankingMeasure3 = rankingMeasure3;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private SqlTuningSetAdminCredentialDetails credentialDetails;

        public Builder credentialDetails(SqlTuningSetAdminCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /** The owner of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the Sql tuning set.
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /** The name of the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Sql tuning set.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         */
        @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
        private String basicFilter;

        /**
         * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on
         * attributes of the SQLSET_ROW. User could use any combination of the following columns
         * with appropriate values as Sql predicate Refer to the documentation
         * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
         *
         * @param basicFilter the value to set
         * @return this builder
         */
        public Builder basicFilter(String basicFilter) {
            this.basicFilter = basicFilter;
            this.__explicitlySet__.add("basicFilter");
            return this;
        }
        /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
        @com.fasterxml.jackson.annotation.JsonProperty("recursiveSql")
        private RecursiveSql recursiveSql;

        /**
         * Specifies that the filter must include recursive Sql in the Sql tuning set.
         *
         * @param recursiveSql the value to set
         * @return this builder
         */
        public Builder recursiveSql(RecursiveSql recursiveSql) {
            this.recursiveSql = recursiveSql;
            this.__explicitlySet__.add("recursiveSql");
            return this;
        }
        /**
         * Specifies a filter that picks the top n% according to the supplied ranking measure. Note
         * that this parameter applies only if one ranking measure is supplied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resultPercentage")
        private Double resultPercentage;

        /**
         * Specifies a filter that picks the top n% according to the supplied ranking measure. Note
         * that this parameter applies only if one ranking measure is supplied.
         *
         * @param resultPercentage the value to set
         * @return this builder
         */
        public Builder resultPercentage(Double resultPercentage) {
            this.resultPercentage = resultPercentage;
            this.__explicitlySet__.add("resultPercentage");
            return this;
        }
        /** The top limit Sql from the filtered source, ranked by the ranking measure. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultLimit")
        private Integer resultLimit;

        /**
         * The top limit Sql from the filtered source, ranked by the ranking measure.
         *
         * @param resultLimit the value to set
         * @return this builder
         */
        public Builder resultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            this.__explicitlySet__.add("resultLimit");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure1")
        private RankingMeasure rankingMeasure1;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure1 the value to set
         * @return this builder
         */
        public Builder rankingMeasure1(RankingMeasure rankingMeasure1) {
            this.rankingMeasure1 = rankingMeasure1;
            this.__explicitlySet__.add("rankingMeasure1");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure2")
        private RankingMeasure rankingMeasure2;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure2 the value to set
         * @return this builder
         */
        public Builder rankingMeasure2(RankingMeasure rankingMeasure2) {
            this.rankingMeasure2 = rankingMeasure2;
            this.__explicitlySet__.add("rankingMeasure2");
            return this;
        }
        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure3")
        private RankingMeasure rankingMeasure3;

        /**
         * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
         * measures.
         *
         * @param rankingMeasure3 the value to set
         * @return this builder
         */
        public Builder rankingMeasure3(RankingMeasure rankingMeasure3) {
            this.rankingMeasure3 = rankingMeasure3;
            this.__explicitlySet__.add("rankingMeasure3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FetchSqlTuningSetDetails build() {
            FetchSqlTuningSetDetails model =
                    new FetchSqlTuningSetDetails(
                            this.credentialDetails,
                            this.databaseCredential,
                            this.owner,
                            this.name,
                            this.basicFilter,
                            this.recursiveSql,
                            this.resultPercentage,
                            this.resultLimit,
                            this.rankingMeasure1,
                            this.rankingMeasure2,
                            this.rankingMeasure3);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchSqlTuningSetDetails model) {
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("basicFilter")) {
                this.basicFilter(model.getBasicFilter());
            }
            if (model.wasPropertyExplicitlySet("recursiveSql")) {
                this.recursiveSql(model.getRecursiveSql());
            }
            if (model.wasPropertyExplicitlySet("resultPercentage")) {
                this.resultPercentage(model.getResultPercentage());
            }
            if (model.wasPropertyExplicitlySet("resultLimit")) {
                this.resultLimit(model.getResultLimit());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure1")) {
                this.rankingMeasure1(model.getRankingMeasure1());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure2")) {
                this.rankingMeasure2(model.getRankingMeasure2());
            }
            if (model.wasPropertyExplicitlySet("rankingMeasure3")) {
                this.rankingMeasure3(model.getRankingMeasure3());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final SqlTuningSetAdminCredentialDetails credentialDetails;

    public SqlTuningSetAdminCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
    }

    /** The owner of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the Sql tuning set.
     *
     * @return the value
     */
    public String getOwner() {
        return owner;
    }

    /** The name of the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Sql tuning set.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basicFilter")
    private final String basicFilter;

    /**
     * Specifies the Sql predicate to filter the Sql from the Sql tuning set defined on attributes
     * of the SQLSET_ROW. User could use any combination of the following columns with appropriate
     * values as Sql predicate Refer to the documentation
     * https://docs.oracle.com/en/database/oracle/oracle-database/18/arpls/DBMS_SQLTUNE.html#GUID-1F4AFB03-7B29-46FC-B3F2-CB01EC36326C
     *
     * @return the value
     */
    public String getBasicFilter() {
        return basicFilter;
    }

    /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
    public enum RecursiveSql implements com.oracle.bmc.http.internal.BmcEnum {
        HasRecursiveSql("HAS_RECURSIVE_SQL"),
        NoRecursiveSql("NO_RECURSIVE_SQL"),
        ;

        private final String value;
        private static java.util.Map<String, RecursiveSql> map;

        static {
            map = new java.util.HashMap<>();
            for (RecursiveSql v : RecursiveSql.values()) {
                map.put(v.getValue(), v);
            }
        }

        RecursiveSql(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecursiveSql create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RecursiveSql: " + key);
        }
    };
    /** Specifies that the filter must include recursive Sql in the Sql tuning set. */
    @com.fasterxml.jackson.annotation.JsonProperty("recursiveSql")
    private final RecursiveSql recursiveSql;

    /**
     * Specifies that the filter must include recursive Sql in the Sql tuning set.
     *
     * @return the value
     */
    public RecursiveSql getRecursiveSql() {
        return recursiveSql;
    }

    /**
     * Specifies a filter that picks the top n% according to the supplied ranking measure. Note that
     * this parameter applies only if one ranking measure is supplied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resultPercentage")
    private final Double resultPercentage;

    /**
     * Specifies a filter that picks the top n% according to the supplied ranking measure. Note that
     * this parameter applies only if one ranking measure is supplied.
     *
     * @return the value
     */
    public Double getResultPercentage() {
        return resultPercentage;
    }

    /** The top limit Sql from the filtered source, ranked by the ranking measure. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultLimit")
    private final Integer resultLimit;

    /**
     * The top limit Sql from the filtered source, ranked by the ranking measure.
     *
     * @return the value
     */
    public Integer getResultLimit() {
        return resultLimit;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure1")
    private final RankingMeasure rankingMeasure1;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure1() {
        return rankingMeasure1;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure2")
    private final RankingMeasure rankingMeasure2;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure2() {
        return rankingMeasure2;
    }

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rankingMeasure3")
    private final RankingMeasure rankingMeasure3;

    /**
     * Specifies an ORDER BY clause on the selected Sql. User can specify upto three ranking
     * measures.
     *
     * @return the value
     */
    public RankingMeasure getRankingMeasure3() {
        return rankingMeasure3;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FetchSqlTuningSetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", basicFilter=").append(String.valueOf(this.basicFilter));
        sb.append(", recursiveSql=").append(String.valueOf(this.recursiveSql));
        sb.append(", resultPercentage=").append(String.valueOf(this.resultPercentage));
        sb.append(", resultLimit=").append(String.valueOf(this.resultLimit));
        sb.append(", rankingMeasure1=").append(String.valueOf(this.rankingMeasure1));
        sb.append(", rankingMeasure2=").append(String.valueOf(this.rankingMeasure2));
        sb.append(", rankingMeasure3=").append(String.valueOf(this.rankingMeasure3));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchSqlTuningSetDetails)) {
            return false;
        }

        FetchSqlTuningSetDetails other = (FetchSqlTuningSetDetails) o;
        return java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.basicFilter, other.basicFilter)
                && java.util.Objects.equals(this.recursiveSql, other.recursiveSql)
                && java.util.Objects.equals(this.resultPercentage, other.resultPercentage)
                && java.util.Objects.equals(this.resultLimit, other.resultLimit)
                && java.util.Objects.equals(this.rankingMeasure1, other.rankingMeasure1)
                && java.util.Objects.equals(this.rankingMeasure2, other.rankingMeasure2)
                && java.util.Objects.equals(this.rankingMeasure3, other.rankingMeasure3)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.basicFilter == null ? 43 : this.basicFilter.hashCode());
        result = (result * PRIME) + (this.recursiveSql == null ? 43 : this.recursiveSql.hashCode());
        result =
                (result * PRIME)
                        + (this.resultPercentage == null ? 43 : this.resultPercentage.hashCode());
        result = (result * PRIME) + (this.resultLimit == null ? 43 : this.resultLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure1 == null ? 43 : this.rankingMeasure1.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure2 == null ? 43 : this.rankingMeasure2.hashCode());
        result =
                (result * PRIME)
                        + (this.rankingMeasure3 == null ? 43 : this.rankingMeasure3.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
