/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package twitter4j.internal.json;

import twitter4j.*;
import javax.annotation.Generated;


/**
 * A data class representing array of numeric IDs.
 *
 * @author Yusuke Yamamoto - yusuke at mac.com
 */
@Generated(
        value = "generate-lazy-objects.sh",
        comments = "This is Tool Generated Code. NO NOT EDIT",
        date = "5 June 2007"
)
final class LazyIDs implements twitter4j.IDs {
    private twitter4j.internal.http.HttpResponse res;
    private zzzz_T4J_INTERNAL_Factory factory;
    private IDs target = null;

    LazyIDs(twitter4j.internal.http.HttpResponse res, zzzz_T4J_INTERNAL_Factory factory) {
        this.res = res;
        this.factory = factory;
    }

    private IDs getTarget() {
        if (target == null) {
            try {
                target = factory.createIDs(res);
            } catch (TwitterException e) {
                throw new RuntimeException(e);
            }
        }
        return target;
    }

    public long[] getIDs() {
        return getTarget().getIDs();
    }


    public boolean hasPrevious() {
        return getTarget().hasPrevious();
    }


    public long getPreviousCursor() {
        return getTarget().getPreviousCursor();
    }


    public boolean hasNext() {
        return getTarget().hasNext();
    }


    public long getNextCursor() {
        return getTarget().getNextCursor();
    }

    public RateLimitStatus getRateLimitStatus() {
        return getTarget().getRateLimitStatus();
    }

    public int getAccessLevel() {
        return getTarget().getAccessLevel();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IDs)) return false;
        return getTarget().equals(o);
    }

    @Override
    public int hashCode() {
        return getTarget().hashCode();
    }

    @Override
    public String toString() {
        return "LazyIDs{" +
                "target=" + getTarget() +
                "}";
    }
}
