package com.leetcode.oj.problem.solution.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * URL: <a href="https://leetcode.com/problems/unique-email-addresses/">Unique Email Addresses</a>
 * <p>
 * Every email consists of a local name and a domain name, separated by the @ sign.
 * <p>
 * For example, in alice@leetcode.com, alice is the local name, and leetcode.com is the domain name.
 * <p>
 * Besides lowercase letters, these emails may contain '.'s or '+'s.
 * <p>
 * If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.  (Note that this rule does not apply for domain names.)
 * <p>
 * If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)
 * <p>
 * It is possible to use both of these rules at the same time.
 * <p>
 * Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
 * Output: 2
 * Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= emails[i].length <= 100
 * 1 <= emails.length <= 100
 * Each emails[i] contains exactly one '@' character.
 */
public class UniqueEmailAddresses {
    private static final Logger LOGGER = LoggerFactory.getLogger(UniqueEmailAddresses.class);

    // TODO: not fast
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueMails = new HashSet<>();
        for (String email : emails) {
            boolean isLoopLocalName = true;
            boolean hasPlus = false;
            String mail = "";
            for (char chr : email.toCharArray()) {
                if (isLoopLocalName) {
                    if ('.' == chr) continue;
                    if ('+' == chr) {
                        hasPlus = true;
                        continue;
                    }
                    if ('@' == chr) {
                        isLoopLocalName = false;
                        hasPlus = false;
                    }
                }
                if (!hasPlus) {
                    mail += chr;
                }
            }
            LOGGER.debug("{} => {}", email, mail);
            uniqueMails.add(mail);
        }
        return uniqueMails.size();
    }
}
