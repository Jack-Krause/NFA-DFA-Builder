# NFA-DFA-Builder
Given a Regular Language, constructs a DFA or NFA

## Mathematical Definitions
The program accepts a **Language**: A set of strings defined by $L \subseteq \{0, 1\}^{*}$  

i.e.,  $L \subseteq \{0, 1\}^{*}$ is enumerated by $\lambda$, 0, 1, 00, 01, 10, 11, 000, ... where $\lambda$ is the empty string

## Theory of Deterministic Finite Automata
DFA are defined as follows: $M = \{Q, \Sigma, \delta, s, F}$, where:
* Q is the finite set of **states**,
* $\Sigma$ is the **input alphabet**, defined as (0, 1) here
* $s \in Q$ is the **start state** (just one for DFA)
* $F \subseteq Q$ is the set of **accepting states**
* d is the **transition function** defined as: $d: Q \times \Sigma \Rightarrow Q$
## Theory of Regular Languages
A **Regular Language** implies the existence of a DFA which accepts the language.

## Current Progress
* Setup
* Need to figure out how to parse set-builder notation. Early implementation will use finite subsets of regular languages
