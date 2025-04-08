terraform {

  required_providers {
    local = {
      source  = "hashicorp/local"
      version = "2.5.1"
    }
  }
}

provider "local" {}

data "local_file" "readme" {
  filename = "README.md"
}

output "file_detail" {
  value = "${data.local_file.readme.filename}: ${data.local_file.readme.content}"
}

# output "file_content" {
#   value = data.local_file.readme.content
# }

