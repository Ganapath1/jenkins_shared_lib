// def call(String project, String ImageTag, String hubUser){

//   sh """
//     docker rmi ${hubUser}/${project}:${ImageTag}
//     docker rmi ${hubUser}/${project}:latest
//   """

// }

def call(String aws_account_id, String region, String ecrRepoUser){

  sh """
      docker rmi ${ecrRepoUser}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepoUser}:latest
  """

}
