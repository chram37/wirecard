
Assumptions:

It is possible to provision Jenkins environment with Ansible already installed and execute the groovy file, but I hope that will be too much for a test. We can defnetly sit and talk for further possibilities. However following assumptions are made:

- There is Jenkins environment already available
- Ansible is already installed


Also, provided example is for Debian, despite we can write roles for multiple environments and then call them appropriately in a different playbook, however went with Debian itself as of now. 

Prerequisites:

- Replace hosts file with appropriate web hosts
- Replace user in Jenkins DSL job with an appropriate user.


PS: Provided a very generic groovy dsl job, however we can add more attributes like restricting accesses to concerned teams and people and cleaning out workspace, creating python virtual enviornment which will have all requirements fullfilled to execute the script and then activating the virtual env and can execute the corresponding playbooks,  etc., currently just making it more simple at this point. 
