/*
 * Copyright 2017 nosemaj.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.medium.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A contributor is any Medium user other than the authenticated user
 * who makes contributions to a publication associated with the
 * authenticated user.
 */
public class Contributor {

    /**
     * The name of the JSON key for the publication id.
     */
    private static final String JSON_KEY_PUBLICATION_ID = "publicationId";

    /**
     * The name of the JSON key for the user id.
     */
    private static final String JSON_KEY_USER_ID = "userId";

    /**
     * The name of the JSON key for the role.
     */
    private static final String JSON_KEY_ROLE = "role";

    /**
     *  An ID for the publication.
     */
    private final String publicationId;

    /**
     * A user ID of the contributor.
     */
    private final String userId;

    /**
     * Role of the user identified by userId in the publication
     * identified by publicationId.
     */
    private final Role role;

    /**
     * Constructs a new contributor.
     *
     * @param publicationId the id of the publication to which a
     *                      contribution was made
     * @param userId the id of the user who makes contributions
     * @param role the role of the contributor with respect to the
     *             publication
     */
    @JsonCreator
    private Contributor(
            @JsonProperty(JSON_KEY_PUBLICATION_ID)final String publicationId,
            @JsonProperty(JSON_KEY_USER_ID)       final String userId,
            @JsonProperty(JSON_KEY_ROLE)          final Role role) {

        this.publicationId = publicationId;
        this.userId = userId;
        this.role = role;
    }

    /**
     * Gets the ID for the publication to which a contributions was
     * made.
     *
     * @return the publication id
     */
    public String getPublicationId() {
        return publicationId;
    }

    /**
     * Gets the user ID of the contributor.
     *
     * @return the user id of the contributor
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Gets the role of the contributor, within the context of the given
     * publication.
     *
     * @return the role of the user during this contribution
     */
    public Role getRole() {
        return role;
    }
}

